package com.company.chapter18javaio.examples.ex020channelcopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * После того как вы вызовете метод read() буфера FileChannel, чтобы сохранить байты
 * в буфере ByteBuffer, вы также должны вызвать для буфера метод flip(), позволяющий
 * впоследствии извлечь из буфера его данные (да, все это выглядит немного непродуманно,
 * но помните, что расчет делался на высокое быстродействие и поэтому все сделано
 * на низком уровне). И если затем нам снова понадобится буфер для чтения, придется
 * вызывать перед каждым методом read() метод clear()
 */
public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("arguments: sourcefile destfile");
            System.exit(1);
        }
        FileChannel in = new FileInputStream(args[0]).getChannel(),
                out = new FileOutputStream(args[1]).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while (in.read(buffer) != -1) {
            buffer.flip(); // Подготовка к записи
            out.write(buffer);
            buffer.clear(); // Подготовка к чтению
        }
    }
}
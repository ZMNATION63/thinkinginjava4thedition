package com.company.chapter18javaio.examples.ex019getchannel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Для любого из рассмотренных выше классов потоков метод getChannel() произведет
 * канал FileChannel. Канал довольно прост: вы можете передать ему байтовый буфер
 * ByteBuffer для чтения и записи, и вы можете заблокировать некоторые участки файла
 * для монопольного доступа (об этом чуть позже).
 * Файл data.txt заново открывается с помощью класса RandomAccessFile. Заметьте, что
 * вы вправе перемещать канал FileChannel по записям, здесь он был передвинут в конец
 * файла так, чтобы дополнительные записи присоединялись к концу файла.
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {

        // Запись файла:
        FileChannel fc = new FileOutputStream("src\\examples\\ex019getchannel\\data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();

        // Добавление в конец файла:
        fc = new RandomAccessFile("src\\examples\\ex019getchannel\\data.txt", "rw").getChannel();
        fc.position(fc.size()); // Перемещение в конец
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        // Чтение файла:
        fc = new FileInputStream("src\\examples\\ex019getchannel\\data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining())
            System.out.print((char) buff.get());
    }
}

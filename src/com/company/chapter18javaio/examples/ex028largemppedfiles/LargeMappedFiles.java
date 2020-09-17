package com.company.chapter18javaio.examples.ex028largemppedfiles;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Механизм отображения файлов в память позволяет вам создавать и изменять файлы,
 * размер которых слишком велик для прямого размещения в памяти. В таком случае вы считаете,
 * что файл целиком находится в памяти, и работаете с ним как с очень большим массивом.
 * <p>
 * Для того чтобы производить одновременное чтение и запись, мы начинаем с создания объекта RandomAccessFile,
 * получаем для этого файла канал, а затем вызываем метод map(), чтобы произвести бyфepMappedByteBuffer,
 * представляющий собой разновидность буфера прямого доступа. Заметьте, что необходимо указать начальную
 * точку и длину участка, который будет проецироваться, то есть у вас есть возможность отображать маленькие
 * участки больших файлов.
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFF; // 128 Мбайт

    public static void main(String[] args) throws Exception {
        MappedByteBuffer out =
                new RandomAccessFile("test.dat", "rw")
                        .getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++)
            out.put((byte) 'x');
        System.out.println("Finished writing");
        for (int i = length / 2; i < length / 2 + 6; i++)
            System.out.println(((char) out.get(i)));
    }
}

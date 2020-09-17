package com.company.chapter18javaio.examples.ex023getdata;

import java.nio.ByteBuffer;

public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
// При выделении буфер автоматически заполняется нулями:
        int i = 0;
        while (i++ < bb.limit())
            if (bb.get() != 0)
                System.out.print("nonzero");
        System.out.print("i = " + i);
        bb.rewind();
// Сохраняем и читаем символьный массив:
        bb.asCharBuffer().put("Howdy!");
        char c;
        while ((c = bb.getChar()) != 0)
            System.out.print(c + " ");
        System.out.print("");
        bb.rewind();
// Сохраняем и читаем число типа short:
        bb.asShortBuffer().put((short) 471142);
        System.out.print(bb.getShort());
        bb.rewind();
// Сохраняем и читаем число типа int:
        bb.asIntBuffer().put(99471142);
        System.out.print(bb.getInt());
        bb.rewind();
// Сохраняем и читаем число типа long:
        bb.asLongBuffer().put(99471142);
        System.out.print(bb.getLong());
        bb.rewind();
// Сохраняем и читаем число типа float:
        bb.asFloatBuffer().put(99471142);
        System.out.print(bb.getFloat());
        bb.rewind();
// Сохраняем и читаем число типа double:
        bb.asDoubleBuffer().put(99471142);
        System.out.print(bb.getDouble());
        bb.rewind();
    }

}
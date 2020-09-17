package com.company.chapter18javaio.examples.ex027usingbuffers;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * Следующий пример использует очень простой алгоритм (перестановка смежных символов) для шифрования и восстановления текста в буфере CharBuffer:
 */
public class UsingBuffers {
    private static void symmetricScramble(CharBuffer buffer) {
        while (buffer.hasRemaining()) {
            buffer.mark();
            char cl = buffer.get();
            char c2 = buffer.get();
            buffer.reset();
            buffer.put(c2).put(cl);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        System.out.println(cb.rewind());
        symmetricScramble(cb);
        System.out.println(cb.rewind());
        symmetricScramble(cb);
        System.out.println(cb.rewind());
    }
}

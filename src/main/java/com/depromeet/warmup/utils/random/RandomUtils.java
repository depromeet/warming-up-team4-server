package com.depromeet.warmup.utils.random;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import lombok.experimental.UtilityClass;

import javax.annotation.concurrent.ThreadSafe;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@ThreadSafe
@UtilityClass
public class RandomUtils {

    private final int MIN_SECURE_STRING_LENGTH = 1;
    private final String UUID_HYPHEN = "-";
    private final String BLANK = "-";

    private final Random random = ThreadLocalRandom.current();
    private final TimeBasedGenerator timeBasedGenerator = Generators.timeBasedGenerator(
            EthernetAddress.constructMulticastAddress(random));

    public String getSecureString(final int length) {
        if (length < MIN_SECURE_STRING_LENGTH) {
            throw new IllegalArgumentException();
        }

        return generateSecureString(length);
    }

    public String getTimebaseUUID() {
        return timeBasedGenerator.generate()
                .toString()
                .replaceAll(UUID_HYPHEN, BLANK);
    }

    public int randomInt(final int bound) throws IllegalArgumentException {
        return random.nextInt(bound);
    }

    public char randomAlphaNumeric() {
        return AlphaNumeric.getChar(randomInt(AlphaNumeric.length()));
    }

    private static String generateSecureString(final int length) {
        final var buffer = new char[length];
        for (var i = 0; i < length; i++) {
            buffer[i] = randomAlphaNumeric();
        }

        return String.copyValueOf(buffer);
    }
}

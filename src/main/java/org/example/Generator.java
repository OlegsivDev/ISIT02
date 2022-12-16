package org.example;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public final class Generator {
    public static String generateProductName() {
        ArrayList productNames = new ArrayList(Arrays.asList("Moloko", "Kartoshka", "Yogurt", "Kasha"));

        Random random_method = new Random();

        int index = random_method.nextInt(productNames.size());
        return (String) productNames.get(index);
    }
    public static String generateManufacturerName() {
        ArrayList manufacturerNames = new ArrayList(Arrays.asList("VoronezhZavod", "USA-TESLA", "AmazonProducts", "ToyotaProducts"));

        Random random_method = new Random();

        int index = random_method.nextInt(manufacturerNames.size());
        return (String) manufacturerNames.get(index);
    }

    public static Date getRandomDate() {
        Calendar calendar = Calendar.getInstance();
        long start = calendar.getTimeInMillis();
        calendar.add(Calendar.YEAR, 1);
        long end = calendar.getTimeInMillis();

        Random random = new Random();
        long randomTimestamp = start + (long) (random.nextDouble() * (end - start));

        return new Date(randomTimestamp);
    }
    public static Date getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        long start = calendar.getTimeInMillis();
        long currentTimestamp = start;

        return new Date(currentTimestamp);
    }

    public static int getRandomIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}

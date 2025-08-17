package com.codechallengewithjava8.api.e2023;

public class DurationFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int years = seconds / (365 * 24 * 60 * 60);
        int days = (seconds % (365 * 24 * 60 * 60)) / (24 * 60 * 60);
        int hours = (seconds % (24 * 60 * 60)) / (60 * 60);
        int minutes = (seconds % (60 * 60)) / 60;
        seconds = seconds % 60;

        StringBuilder result = new StringBuilder();
        boolean isFirstComponent = true;

        if (years > 0) {
            result.append(years).append(" year").append(years > 1 ? "s" : "");
            isFirstComponent = false;
        }
        if (days > 0) {
            if (!isFirstComponent) {
                result.append(", ");
            }
            result.append(days).append(" day").append(days > 1 ? "s" : "");
            isFirstComponent = false;
        }
        if (hours > 0) {
            if (!isFirstComponent) {
                result.append(", ");
            }
            result.append(hours).append(" hour").append(hours > 1 ? "s" : "");
            isFirstComponent = false;
        }
        if (minutes > 0) {
            if (!isFirstComponent) {
                result.append(", ");
            }
            result.append(minutes).append(" minute").append(minutes > 1 ? "s" : "");
            isFirstComponent = false;
        }
        if (seconds > 0) {
            if (!isFirstComponent) {
                result.append(" and ");
            }
            result.append(seconds).append(" seconds").append(seconds > 1 ? "s" : "");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(62));      // "1 minute and 2 seconds"
        //System.out.println(formatDuration(3662));    // "1 hour, 1 minute and 2 seconds"
        //System.out.println(formatDuration(31536000)); // "1 year"
        //System.out.println(formatDuration(3600));    // "1 hour"
        //System.out.println(formatDuration(0));       // "now"
    }
}


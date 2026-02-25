public final class XPoly {
    public static double sum(double... nums) {
        double total = 0;

        for (double num : nums) {
            total += num;
        }

        return total;
    }
    // Tìm số nhỏ nhất
    public static double min(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Khong co tham so truyen vao");
        }

        double min = x[0];

        for (double value : x) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    // Tìm số lớn nhất
    public static double max(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Khong co tham so truyen vao");
        }

        double max = x[0];

        for (double value : x) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}

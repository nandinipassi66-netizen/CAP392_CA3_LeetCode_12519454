class Solution {

    public String numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        String result = "";

        if (num >= 1000000000) {
            result = result + convert(num / 1000000000) + " Billion ";
            num = num % 1000000000;
        }

        if (num >= 1000000) {
            result = result + convert(num / 1000000) + " Million ";
            num = num % 1000000;
        }

        if (num >= 1000) {
            result = result + convert(num / 1000) + " Thousand ";
            num = num % 1000;
        }

        if (num > 0) {
            result = result + convert(num);
        }

        return result.trim();
    }

    public String convert(int num) {

        String[] ones = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        String result = "";

        if (num >= 100) {
            result = result + ones[num / 100] + " Hundred ";
            num = num % 100;
        }

        if (num >= 20) {
            result = result + tens[num / 10] + " ";
            num = num % 10;
        }

        if (num > 0) {
            result = result + ones[num];
        }

        return result.trim();
    }
}

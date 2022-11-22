public class RupiahFormat {
        String getCurrency(String value) {
        String output = "Rp. ";
        int digit = value.length() % 3;
        switch(digit) {
            case 1:
            output += value.substring(0,1) + ",";
            for (int i = 1; i < value.length(); i++) {
                if (i > 1 && i % 3 == 1) output += ",";
                output += value.substring(i,i + 1);
            }
            break;
            case 2:
            output += value.substring(0,2) + ",";
            for (int i = 2; i < value.length(); i++) {
                if (i > 2 && i % 3 == 2) output += ",";
                output += value.substring(i,i + 1);
            }
            break;
            case 0:
            output += value.substring(0,3) + ",";
            for (int i = 3; i < value.length(); i++) {
                if (i > 3 && i % 3 == 0) output += ",";
                output += value.substring(i,i + 1);
            }
        }
        output += ".00";
        return output;
    }
}

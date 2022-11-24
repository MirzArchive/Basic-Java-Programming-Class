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
    
    String pronounce(int num) {
        String noun = "";
        int count = 0;
        if (num >= 1_000_000_000) {
            count = num / 1_000_000_000;
            num %= 1_000_000_000;
            noun += (count > 9) ? pronounce(count) + "Miliar " : say(count) + "Miliar ";
        }
        if (num >= 1_000_000) {
            count = num / 1_000_000;
            num %= 1_000_000;
            noun += (count > 9) ? pronounce(count) + "Juta " : say(count) + "Juta ";
        }  
        if (num >= 1_000) {
            count = num / 1_000;
            num %= 1_000;
            noun += (count != 1) ? pronounce(count) + "Ribu " : "Seribu ";
        }    
        if (num >= 100) {
            count = num / 100;
            num %= 100;
            noun += (count != 1) ? say(count) + "Ratus " : "Seratus ";
        }
        if (num > 19 || num == 10) {
            count = num / 10;
            num %= 10;
            noun += (count != 1) ? say(count) + "Puluh " : "Sepuluh ";
        }
        if (num > 10) {
            num %= 10;
            noun += (num != 1) ? say(num) + "Belas " : "Sebelas ";
            num = 0;
        }
        if (num > 0 && num < 10) noun += say(num);
        return noun;
    }

    String say(int n) {
        switch(n) {
            case 1: return "Satu ";
            case 2: return "Dua ";
            case 3: return "Tiga ";
            case 4: return "Empat ";
            case 5: return "Lima ";
            case 6: return "Enam ";
            case 7: return "Tujuh ";
            case 8: return "Delapan ";
            case 9: return "Sembilan ";
            default: return "";
        }
    }
}
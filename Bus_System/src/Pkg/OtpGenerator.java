package Pkg;

import java.util.Random;

public class OtpGenerator {

    public static String generateOtp() {
        // Menghasilkan kode OTP dengan panjang 6 karakter
        int otpLength = 6;
        StringBuilder otp = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < otpLength; i++) {
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }
}


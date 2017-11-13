package com.nxs.sell;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

public class Main {

        private static final String DES = "DES";
        private static final String SECRET_KEY = "dianzanmao.com";


        public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
            SecureRandom sr = new SecureRandom();
            DESKeySpec dks = new DESKeySpec(key);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, securekey, sr);
            return cipher.doFinal(src);
        }

        public static final String encrypt(String password, String key) {
            try {
                return byte2String(encrypt(password.getBytes(), key.getBytes()));
            } catch (Exception var3) {
                return null;
            }
        }

        public static final String encrypt(String password) {
            try {
                return byte2String(encrypt(password.getBytes(), "dianzanmao.com".getBytes()));
            } catch (Exception var2) {
                var2.printStackTrace();
                return null;
            }
        }

        public static String byte2String(byte[] b) {
            String hs = "";
            String stmp = "";

            for(int n = 0; n < b.length; ++n) {
                stmp = Integer.toHexString(b[n] & 255);
                if (stmp.length() == 1) {
                    hs = hs + "0" + stmp;
                } else {
                    hs = hs + stmp;
                }
            }

            return hs.toUpperCase();
        }

        public static byte[] decrypt(byte[] src, byte[] key) throws Exception {
            SecureRandom sr = new SecureRandom();
            DESKeySpec dks = new DESKeySpec(key);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, securekey, sr);
            return cipher.doFinal(src);
        }

        public static final String decrypt(String data, String key) {
            try {
                return new String(decrypt(String2byte(data.getBytes()), key.getBytes()));
            } catch (Exception var3) {
                var3.printStackTrace();
                return null;
            }
        }

        public static final String decrypt(String data) {
            try {
                return new String(decrypt(String2byte(data.getBytes()), "dianzanmao.com".getBytes()));
            } catch (Exception var2) {
                var2.printStackTrace();
                return null;
            }
        }

        public static byte[] String2byte(byte[] b) {
            if (b.length % 2 != 0) {
                throw new IllegalArgumentException("长度不是偶数");
            } else {
                byte[] b2 = new byte[b.length / 2];

                for(int n = 0; n < b.length; n += 2) {
                    String item = new String(b, n, 2);
                    b2[n / 2] = (byte)Integer.parseInt(item, 16);
                }

                return b2;
            }
        }

        public static void main(String[] args) {
            String encryptString = encrypt("cae3488fbd5d84a77a97545568383e67", "dianzanmao.com");
            System.out.println(encryptString);
            String desencryptString = decrypt("3CA3E56A7FFCDDF7B33874F876DB0BD338F31A0AC247B0E6D76CE9E59C3246A0D25BFF659E902DD5", "dianzanmao.com");
            System.out.println(desencryptString);
        }

}

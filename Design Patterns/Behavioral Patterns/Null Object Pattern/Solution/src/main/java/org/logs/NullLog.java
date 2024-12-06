package org.logs;

public class NullLog implements Log {
    private int recordCount = 0;  // Simüle edilen log sayısı

    @Override
    public int getRecordLimit() {
        return Integer.MAX_VALUE;  // Log limitini sınırsız yapıyoruz
    }

    @Override
    public int getRecordCount() {
        return recordCount;  // Kaydedilen log sayısını döndür
    }

    @Override
    public void logInfo(String message) {
        recordCount++;  // Log kaydı her çağrıldığında sayıyı artır
    }
}

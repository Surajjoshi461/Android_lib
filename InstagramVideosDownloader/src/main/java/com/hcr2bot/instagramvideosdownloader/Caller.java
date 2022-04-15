package com.hcr2bot.instagramvideosdownloader;

public interface Caller {
    void getUrl(String url);
    void error(String error);
    void downloaded();
}

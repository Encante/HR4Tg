package net.selev.hr4tg.config;

public class Secrets {

    public final String BASE_URL = System.getenv("BASE_URL");
    public final Long JA_CHATID = Long.parseLong(System.getenv("JA_CHATID"));

}

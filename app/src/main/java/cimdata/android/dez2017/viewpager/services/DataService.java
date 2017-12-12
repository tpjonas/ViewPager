package cimdata.android.dez2017.viewpager.services;

public class DataService {

    private static String[] data;

    static {

        data = new String[] {
                "Data 1",
                "Data 2",
                "Data 3",
        };
    }

    public static String[] fetchData() {
        return data;
    }
}

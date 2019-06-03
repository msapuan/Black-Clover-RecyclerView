package com.sapuan.blackcloverrecyclerview;

import java.util.ArrayList;

public class BlackCloverData {
    public static String[][] data = new String[][] {
            {
                "Yami Sukehiro",
                "Kaisar Sihir",
                "https://dimwhp0w2rs83.cloudfront.net/2017/12/1513658959-yami.jpg",
                "Black Bull",
                "Yami Sukehiro merupakan kapten dari squad Black Bull di anime Black Clover. Jika dilihat sekilas, penampilannya sangat menyeramkan karena bentuk badannya yang tinggi dan kekar. Ia juga memiliki rambut hitam panjang yang selalu dibiarkan berantakan."
            },
            {
                "Asta",
                "Kaisar Sihir",
                "https://dimwhp0w2rs83.cloudfront.net/2017/12/1513311283-black-clover-project-knights.jpg",
                "Black Bull",
                "Asta merupakan salah satu tokoh utama di dalam anime ini. Ia adalah anak yatim piatu yang ditinggalkan di depan gereja desa Hage bersama dengan Yuno. Sejak kecil, ia sangat akrab dengan Yuno dan menjadikannya rival karena keduanya memiliki impian untuk menjadi Wizard King."
            },
            {
                "Noelle Silva",
                "Kaisar Sihir",
                "https://dimwhp0w2rs83.cloudfront.net/2017/12/1513670517-noelle.jpg",
                "Black Bull",
                "Noelle Silva merupakan anak perempuan kedua dari Keluarga Silva, yang merupakan keluarga bangsawan di Kerajaan Clover. Sayangnya, sebagai keturunan keluarga bangsawan Noelle tidak dapat mengendalikan ilmu sihir yang dimilikinya sehingga ia dianggap gagal oleh keluarga sendiri."
            },
            {
                "Magna Swing",
                "Kaisar Sihir",
                "https://dimwhp0w2rs83.cloudfront.net/2017/12/1513671744-magna-swing.jpg",
                "Black Bull",
                "Magna Swing merupakan anggota dari Black Bull di anime Black Clover yang cukup sering muncul. Diceritakan pada animenya bahwa Magna berasal dari desa kecil, sama seperti Asta, namun akhirnya berhasil menjadi Magic Knight berkat dorongan dari kepala desa Sosshi."
            },
            {
                "Vanessa Enoteca",
                "Kaisar Sihir",
                "https://dimwhp0w2rs83.cloudfront.net/2017/12/1513672381-Vanessa-Enoteca.jpg",
                "Black Bull",
                "Vanessa Enoteca merupakan sosok perempuan cantik dan seksi yang berasal dari Desa Penyihir di Kerajaan Clover. Pada awalnya, ia dikurung oleh Ratu Penyihir di desanya hingga ia diselamatkan oleh Yami Sukehiro dan bergabung dengan Black Bull."
            }

    };

    public static ArrayList<BlackClover> getListData() {
        BlackClover blackclover = null;
        ArrayList<BlackClover> list = new ArrayList<>();
        for (String[] aData : data) {
            blackclover = new BlackClover();
            blackclover.setName(aData[0]);
            blackclover.setRemarks(aData[1]);
            blackclover.setPhoto(aData[2]);
            blackclover.setTeam(aData[3]);
            blackclover.setInfo(aData[4]);

            list.add(blackclover);
        }
        return list;
    }
}

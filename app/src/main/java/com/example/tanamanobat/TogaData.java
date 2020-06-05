package com.example.tanamanobat;

import android.widget.Toolbar;

import java.util.ArrayList;

public class TogaData {
    private static String[] namaToga = {
            "Belimbing Wuluh",
            "Bunga Kenop",
            "Jahe",
            "Jeruk Nipis",
            "Kemuning",
            "Kencur",
            "Kumis Kucing",
            "Kunyit",
            "Lidah Buaya",
            "Seledri",
            "Temulawak"
    };

    private static String[] detailToga = {
            "Belimbing wuluh menjadi salah satu tanaman obat jenis buah-buahan yang bisa kamu tanam di rumah. " +
                    "Buah yang satu ini sangat kaya akan vitamin C, flavonoid, asam format, saponin, peroksidase, dan lain sebagainya. " +
                    "Tidak hanya itu, belimbing juga memiliki kandungan asam oksalat yang bagus untuk dikonsumsi, khususnya untuk yang mempunyai masalah pada ginjal. Dari beberapa kandungan tersebut, terdapat khasiat yang bisa kamu nikmati. " +
                    "Di antaranya yaitu belimbing dapat meredakan batuk, menyembuhkan sariawan, sakit gigi karena berlubang, memperbaiki fungsi pencernaan, rematik, hipertensi, gusi berdarah dan penyakit lainnya. ",
            "Bunga kenop sejatinya memiliki beragam khasiat, diantaranya yaitu mampu meredakan demam, sakit kepala, menyembuhkan radang mata, batuk, disentri, asma hingga mampu menambah nafsu makan. " +
                    "Jika ingin menanam tanaman obat yang satu ini di rumah, proses pemeliharaan yang perlu kamu lakukan sangat mudah. Kamu hanya perlu menyiram sesuai dengan jadwalnya, mengecek sensor kelembapan tanah dan melakukan pemupukan secara reguler.",
            "Jahe biasanya dikonsumsi sebagai minuman untuk menghangatkan tubuh. Namun tidak hanya itu, jahe juga mampu mengatasi gangguan pencernaan, vertigo, rematik, meredakan sakit haid, mual saat hamil hingga mengobati infeksi saluran pernapasan bagian atas.",
            "Bagi kamu yang suka mengonsumsi jeruk nipis, kabarnya akan terhindar dari beberapa jenis penyakit, seperti vertigo, tekanan darah tinggi, batu ginjal, difteri, amandel, ambeien hingga panu. " +
                    "Kamu bisa mengonsumsi jeruk nipis sebagai obat pereda dahak dan mencampurkannya dengan kecap manis. Selain itu, jeruk nipis juga kerap kali dijadikan bahan pelengkap untuk membuat sambal hingga diolah menjadi racikan minum teh.",
            "Sebagian dari kamu mungkin hanya mengetahui kemuning sebagai tanaman hias saja. Namun ternyata, kemuning memiliki 60 kandungan senyawa minyak atsiri pada bagian daunnya. " +
                    "Tidak hanya itu, kandungan lain yang dimiliki bunga ini di antaranya yaitu alkaloid indol, alkaloid tanin, flavonoid, saponin, kumarin dan glikosida jantung. " +
                    "Dari kandungan-kandungan tersebut, kemuning juga dapat digunakan untuk menghindari terjadinya pembekuan darah atau koagulasi.",
            "Tanaman obat dalam bentuk rempah yang pertama adalah kencur. Tanaman ini memiliki beberapa kandungan, di antaranya yaitu minyak atsiri, saponin, polifenol, asam cinnamic, mineral, alkaloid, bomeol, ethyl aster dan beberapa kandungan lainnya. " +
                    "Tanaman dengan nama latin Kaempferia galangal ini memiliki banyak sekali khasiat baik untuk tubuh, seperti membantu menambah stamina dan nafsu makan, melancarkan haid, mengobati flu, diare, radang lambung, sakit kepada dan batuk berdahak. ",
            "Tanaman berbunga yang satu ini selain terkenal akan keindahannya, juga terkenal akan segudang khasiatnya. Di mana, ia sangat bermanfaat dalam melancarkan saluran kemih bagi penderita penyakit batu ginjal. " +
                    "Tidak hanya itu, khasiat lainnya yang dimiliki kumis kucing yaitu mampu mengobati asam urat, rematik, hipertensi, diabetes, hingga batuk sekalipun.",
            "Jenis tanaman obat dalam bentuk rempah adalah kunyit. Seperti yang diketahui, warna oranye pada kunyit ternyata berasal dari zat kurkumin yang dikandungnya. " +
                    "Tidak hanya itu, kurkumin juga berkhasiat dalam membantu menjaga kesehatan dan melindungi diri dari terpaan berbagai macam penyakit, seperti mengurangi risiko penyakit jantung, stroke, menyembuhkan radang gusi, demam, gatal-gatal, dan sebagainya.",
            "Lidah buaya masuk ke dalam jenis tanaman obat dalam bentuk daun-daunan. Tanaman yang belakangan ini banyak digemari wanita ini meng-klaim dirinya mampu menjaga kelembapan kulit dan menghambat penuaan. " +
                    "Dalam dunia medis, lidah buaya juga mampu membantu menyembuhkan luka kulit dengan cepat. Selain itu, lidah buaya juga mampu meningkatkan sistem imun tubuh dan menetralisir sistem pencernaan.",
            "Tanaman yang satu ini biasanya dikonsumsi sebagai makanan pelengkap, seperti lalapan dan sebagainya. " +
                    "Meski memiliki aroma yang kurang sedap, namun seledri nyatanya mempunyai segudang manfaat yang baik untuk tubuh, seperti mampu mengobati rematik, menurunkan tekanan darah, diabetes, mata kering dan asma.",
            "Tanaman yang memiliki nama lain curcuma ini juga memiliki segudang manfaat dan khasiat baik untuk tubuh, diantaranya yaitu mampu mengatasi pegal-pegal, sakit kuning, gangguan lambung, irritable bowel syndrome (IBS) dan lain sebagainya."
    };

    private static int[] gambarToga= {
            R.drawable.belimbing_wuluh,
            R.drawable.bunga_kenop,
            R.drawable.jahe,
            R.drawable.jeruk_nipis,
            R.drawable.kemuning,
            R.drawable.kencur,
            R.drawable.kumis_kucing,
            R.drawable.kunyit,
            R.drawable.lidah_buaya,
            R.drawable.selederi,
            R.drawable.temulawak
    };

    static ArrayList<Toga> getData(){
        ArrayList<Toga> list = new ArrayList<>();
        for (int position = 0; position < namaToga.length; position++){
            Toga toga = new Toga();
            toga.setToga(namaToga[position]);
            toga.setDetail_toga(detailToga[position]);
            toga.setPhoto_toga(gambarToga[position]);
            list.add(toga);
        }

        return list;
    }
}

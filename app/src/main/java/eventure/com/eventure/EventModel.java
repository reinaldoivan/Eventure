package eventure.com.eventure;

/**
 * Created by ivan on 5/2/2016.
 */
public class EventModel {
    public EventModel(){}

    public EventModel(int image, int detailImage, String eventName, String venue, String date, String eventDetail)
    {
        this.image = image;
        this.detailImage = detailImage;
        this.eventName = eventName;
        this.venue = venue;
        this.date = date;
        this.eventDetail = eventDetail;
    }

    public int image;
    public int detailImage;
    public String eventName;
    public String venue;
    public String date;
    public String eventDetail;

    private static EventModel[] events;
    public static EventModel[] getEvents()
    {
        if(events == null)
            events = new EventModel[]
            {
                    new EventModel(
                            R.drawable.binusfestanggrek,
                            R.drawable.posterbinusfest,
                            "Binus Festival", "Binus ASM", "04-05-16",
                            "Siapa yang belum mengenal BINUS Festival ? Ya! Ajang presentasi ide bisnis BINUSIAN. " +
                                    "Kegiatan ini adalah kegiatan rutin yang diadakan setiap semester untuk mengajak BINUSIAN lebih " +
                                    "mengenal dan mendalami dunia entrepreneur melalui ide bisnis yang dipamerkan. " +
                                    "Acara ini juga merupakan suatu bentuk motivasi kepada BINUSIAN untuk menjadi entrepreneur.\n" +
                                    "\n" +
                                    "Sesuai dengan target BINUS UNIVERSITY, yaitu 2 dari 3 lulusan BINUS UNIVERSITY" +
                                    "bekerja di perusahaan global, multinasional atau menjadi entrepreneur, Minggu ke-11 " +
                                    "di perkuliahan ini BINUS ENTREPRENEUR CENTER (BEC) menyulap Kampus Anggrek menjadi Kampus " +
                                    "entrepreneur. BINUS Festival kali ini akan diselenggarakan pada tanggal 2 – 4 Mei 2016."),
                    new EventModel(
                            R.drawable.seminar,
                            R.drawable.posterbifest,
                            "Seminar", "Binus ASM", "04-05-16",
                            "Binus Festival bukan hanya menampilkan berbagai karya entrepeneur masa depan, tetapi pada " +
                                    "acara ini juga akan diadakan seminar yang mengundang berbagai pembicara " +
                                    "yang tentunya sudah lama berkecimpung dalam dunia bisnis. Diharapakan dengan " +
                                    "diadakannya seminar ini, kita sebagai entrepeneur muda dapat belajar banyak hal " +
                                    "untuk mendukung perekonomian Indonesia bahkan dunia. Khusus untuk anak Binus, " +
                                    "kalian juga akan mendapatkan poin SAT loh!"),
                    new EventModel(
                            R.drawable.binusalsut,
                            R.drawable.binusalsut,
                            "Perkuliahan", "Binus ASM", "09-05-16",
                            "Ayo kuliah jangan acara terus!!"),
            };

        return events;
    }
}

package fo.vera.sjonvarp

class VideoFetcher {
    public fun getVideos(): Array<VideoList> {
        var tvChannels = VideoList(title = "Sjónvarpsrásir");
        var kvfTvChannel = Video(title = "KVF", videoUrl = "https://play.kringvarp.fo/redirect/kvf/_definst_/smil:kvf.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/bootstrap_subtheme/favicon.ico", id = 0, description = "", backgroundImageUrl = "", studio = "")
        tvChannels.videos = ArrayList();
        tvChannels.videos!!.add(kvfTvChannel);

        var peppaPig = VideoList(title = "Grísa Peppa");
        var peppaPigVideo1 = Video(title = "Partur 1", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Grisa_Peppa_E001_v1.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/grisa_peppa-01.png", id = 0, description = "", backgroundImageUrl = "", studio = "")
        peppaPig.videos = ArrayList();
        peppaPig.videos!!.add(peppaPigVideo1);

        var sarahAndDuck = VideoList(title = "Sára og Dunna");
        sarahAndDuck.videos = ArrayList();
        sarahAndDuck.videos!!.add(Video(title = "Partur 1", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Sara_og_Dunna_01_OK.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 2", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Sara_og_Dunna_02_OK.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 3", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:UT372_3_Sara_og_Dunna_3_BBC.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 4", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:UT372_4_Sara_og_Dunna_4_BBC.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 5", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:UT372_5_Sara_og_Dunna_5_BBC.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 6", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Sara_og_Dunna_06.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 7", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Sara_og_Dunna_07.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 8", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Sara_og_Dunna_08.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 9", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Sara_og_Dunna_09.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        for (i in 10..19) {
            sarahAndDuck.videos!!.add(Video(title = "Partur $i", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Sara_og_Dunna_$i.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        }
        sarahAndDuck.videos!!.add(Video(title = "Partur 20", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:UT372_20_Sara_og_Dunna_20_BBC.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        sarahAndDuck.videos!!.add(Video(title = "Partur 22", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:UT372_22_Sara_og_Dunna_22_BBC.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/all/themes/vit/images/sara%20og%20dunna", id = 0, description = "", backgroundImageUrl = "", studio = ""));



        var mouk = VideoList(title = "Mouk");
        mouk.videos = ArrayList();
        mouk.videos!!.add(Video(title = "Partur 1", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_01.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 2", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_02.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 3", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_03.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 4", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_04.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 5", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_05.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 6", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_06.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 7", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_07.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 8", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_08.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        mouk.videos!!.add(Video(title = "Partur 9", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_09.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        for (i in 10..24) {
            mouk.videos!!.add(Video(title = "Partur $i", videoUrl = "https://play.kringvarp.fo/redirect/video/_definst_/smil:Mouk_01.smil?type=m3u8", cardImageUrl = "https://kvf.fo/sites/default/files/styles/news_xtra_xtra_large_2/public/mouk_mynd.png", id = 0, description = "", backgroundImageUrl = "", studio = ""));
        }

        return arrayOf(tvChannels,peppaPig, sarahAndDuck, mouk);
    }
}
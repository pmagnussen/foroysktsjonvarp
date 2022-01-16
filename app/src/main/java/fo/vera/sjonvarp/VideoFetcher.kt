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

        return arrayOf(tvChannels,peppaPig);
    }
}
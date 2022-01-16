package fo.vera.sjonvarp

import java.io.Serializable

data class VideoList(
    var title: String? = null,
    var description: String? = null,
    var backgroundImageUrl: String? = null,
    var cardImageUrl: String? = null,
    var studio: String? = null,
    var videos: ArrayList<Video>? = null
)
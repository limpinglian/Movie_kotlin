package com.example.movie_kotlin.Model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Movie {

    @JsonProperty("Title")
    var title: String? = null
    @JsonProperty("Year")
    var year: String? = null
    @JsonProperty("imdbID")
    var imdbID: String? = null
    @JsonProperty("Type")
    var type: String? = null
    @JsonProperty("Poster")
    var poster: String? = null



}

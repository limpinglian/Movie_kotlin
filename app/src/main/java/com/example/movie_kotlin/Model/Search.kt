package com.example.movie_kotlin.Model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Search {
    @JsonProperty("Search")
    lateinit var search: List<Movie>
    @JsonProperty("totalResults")
    var totalResults: String? = null
    @JsonProperty("Response")
    var response: String? = null
}



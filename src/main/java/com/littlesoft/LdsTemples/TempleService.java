package com.littlesoft.LdsTemples;

import java.util.List;

import retrofit.http.GET;

interface TempleService {
    @GET("/temples")
    PhotosResponse getTemplePhotos();

    static class PhotosResponse {
        List<Photo> photos;
    }

    static class Photo {
        int id;
        String src;
        String name;
        String copyright;
    }
}

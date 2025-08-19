package com.bobadilla.simple.factory;

public class PostFactory {
    
    
    
    
    public static Post createPost(String type){

        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post ype is unkown");
        }

    }





}

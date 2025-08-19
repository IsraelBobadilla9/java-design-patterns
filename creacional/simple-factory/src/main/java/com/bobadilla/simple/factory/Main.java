package com.bobadilla.simple.factory;

// No confundir con el factory method


public class Main {
    public static void main(String[] args) {
        
        Post post = PostFactory.createPost("news");
        System.out.println(post);

    }
}
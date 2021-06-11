package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromID;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String post_type;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private Geo geo;
    private ViewsService viewsService;
    private RepostsInfo repostsInfo;
    private Copyright copyright;
    private PostSource postSource;
    private Donut donut;

    // + get/set на все поля
}

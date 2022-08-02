package com.ll.exam;

import com.ll.exam.article.controllor.ArticleController;

public class Container {
    public static ArticleController getArticleController() {
        return new ArticleController();
    }
}
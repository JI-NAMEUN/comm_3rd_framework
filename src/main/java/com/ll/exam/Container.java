package com.ll.exam;

import com.ll.exam.article.controllor.ArticleController;

public class Container {
    private static final ArticleController articleControllor;
       static {
           articleControllor= new ArticleController();
       }
    public static ArticleController getArticleController() {
        return ArticleController();
    }
}
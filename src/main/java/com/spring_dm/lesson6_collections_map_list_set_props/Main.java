package com.spring_dm.lesson6_collections_map_list_set_props;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("lesson6_collections_map_list_set_props/app-context-xml.xml");
//        ctx.refresh();
//
//        CollectionsTestXml instanse = (CollectionsTestXml) ctx.getBean("collectionsTest");
//        instanse.displayInfo();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("lesson6_collections_map_list_set_props/app-context-annotation.xml");
        ctx.refresh();

        CollectionsTestAnnotation instanse =
                (CollectionsTestAnnotation) ctx.getBean("injectCollectionsAnnotation");
        instanse.displayInfo();
    }
}

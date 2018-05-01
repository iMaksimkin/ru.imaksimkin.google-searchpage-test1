package tests;

@Test
public void SearchPageTest() throws Exception{
        Google google = Google.getNew();
        google.performSearch("search smth");
        //ну, у меня отображается 10 ссылок
        Assert.assertEquals(10, google.getLinkCount());
        google.clickOn(0);
        AnyPage anyPage =  google.get(AnyPage.class, 1);
        anyPage.close();

        google.performSearch("search smth2");
        }

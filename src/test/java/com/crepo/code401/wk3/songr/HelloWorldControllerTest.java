package com.crepo.code401.wk3.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void capitalizeWord() {
        HelloWorldController hw = new HelloWorldController();
        assertEquals("HELLO", hw.capitalizeWord("hello"));
    }

    @Test
    public void reverseSentence() {
        HelloWorldController hw = new HelloWorldController();
        assertEquals("world hello ", hw.reverseSentence("hello world"));
    }
}
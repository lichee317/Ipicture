package com.meterware.httpunit.dom;
/********************************************************************************************************************
 * $Id: DomTestSuite.java 783 2007-07-22 16:08:45Z russgold $
 *
 * Copyright (c) 2004-2007, Russell Gold
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************************************************/
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 *
 * @author <a href="mailto:russgold@httpunit.org">Russell Gold</a>
 **/
public class DomTestSuite {


    public static void main( String[] args ) {
        TestRunner.run( suite() );
    }

    public static TestSuite suite() {
        TestSuite result = new TestSuite();
        result.addTest( AttributesTest.suite() );
        result.addTest( NodeTest.suite() );
        result.addTest( DocumentImportTest.suite() );

        result.addTest( HTMLDocumentTest.suite() );
        result.addTest( HTMLElementTest.suite() );
        result.addTest( HTMLSelectTest.suite() );
        result.addTest( HTMLFormTest.suite() );
        result.addTest( HTMLFormSubmitTest.suite() );
        result.addTest( HTMLTableTest.suite() );
        result.addTest( DomWindowTest.suite() );

        result.addTest( DomScriptingTest.suite() );
        result.addTest( DomEventScriptingTest.suite() );
        return result;
    }

}

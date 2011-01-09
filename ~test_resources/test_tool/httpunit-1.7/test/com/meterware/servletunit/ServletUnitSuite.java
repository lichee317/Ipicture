package com.meterware.servletunit;
/********************************************************************************************************************
* $Id: ServletUnitSuite.java 975 2008-05-16 19:44:48Z russgold $
*
* Copyright (c) 2000-2004, Russell Gold
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

import com.meterware.httpunit.ConditionalTestSuite;

import junit.framework.Test;
import junit.framework.TestSuite;


/**
 * Tests for the package.
 **/
public class ServletUnitSuite extends ConditionalTestSuite {

    public static void main( String args[] ) {
        junit.textui.TestRunner.run( suite() );
    }


    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest( HttpServletRequestTest.suite() );
        suite.addTest( HttpServletResponseTest.suite() );
        suite.addTest( StatelessTest.suite() );
        suite.addTest( StatefulTest.suite() );
        suite.addTest( SessionTest.suite() );
        suite.addTest( NavigationTest.suite() );
        suite.addTest( ConfigTest.suite() );
        suite.addTest( WebXMLTest.suite() );
        suite.addTest( ListenersTest.suite() );
        suite.addTest( FiltersTest.suite() );
        suite.addTest( RequestContextTest.suite() );
        suite.addTest( RequestDispatcherTest.suite() );
        addOptionalTestCase( suite, "com.meterware.servletunit.JUnitServletTest" );
        return suite;
    }


}


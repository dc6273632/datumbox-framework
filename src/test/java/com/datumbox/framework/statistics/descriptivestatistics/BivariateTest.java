/**
 * Copyright (C) 2013-2015 Vasilis Vryniotis <bbriniotis at datumbox.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.datumbox.framework.statistics.descriptivestatistics;

import com.datumbox.common.dataobjects.AssociativeArray;
import com.datumbox.common.dataobjects.DataTable2D;
import com.datumbox.common.dataobjects.Dataset;
import com.datumbox.common.dataobjects.Record;

import com.datumbox.tests.utilities.TestUtils;
import org.junit.Test;

/**
 *
 * @author bbriniotis
 */
public class BivariateTest {
    
    public BivariateTest() {
    }

    private Dataset generateDataset() {
        Dataset dataset = new Dataset();
        
        AssociativeArray xData1 = new AssociativeArray();
        xData1.put(0, 6);
        xData1.put(1, 5);
        xData1.put(2, 3);
        xData1.put(3, 4);
        dataset.add(new Record(xData1, null));
        
        AssociativeArray xData2 = new AssociativeArray();
        xData2.put(0, 7);
        xData2.put(1, 3);
        xData2.put(2, 2);
        xData2.put(3, 2);
        dataset.add(new Record(xData2, null));
        
        AssociativeArray xData3 = new AssociativeArray();
        xData3.put(0, 6);
        xData3.put(1, 4);
        xData3.put(2, 4);
        xData3.put(3, 5);
        dataset.add(new Record(xData3, null));
        
        AssociativeArray xData4 = new AssociativeArray();
        xData4.put(0, 5);
        xData4.put(1, 7);
        xData4.put(2, 1);
        xData4.put(3, 3);
        dataset.add(new Record(xData4, null));
        
        AssociativeArray xData5 = new AssociativeArray();
        xData5.put(0, 7);
        xData5.put(1, 7);
        xData5.put(2, 5);
        xData5.put(3, 5);
        dataset.add(new Record(xData5, null));
        
        AssociativeArray xData6 = new AssociativeArray();
        xData6.put(0, 6);
        xData6.put(1, 4);
        xData6.put(2, 2);
        xData6.put(3, 3);
        dataset.add(new Record(xData6, null));
        
        AssociativeArray xData7 = new AssociativeArray();
        xData7.put(0, 5);
        xData7.put(1, 7);
        xData7.put(2, 2);
        xData7.put(3, 1);
        dataset.add(new Record(xData7, null));
        
        AssociativeArray xData8 = new AssociativeArray();
        xData8.put(0, 6);
        xData8.put(1, 5);
        xData8.put(2, 4);
        xData8.put(3, 4);
        dataset.add(new Record(xData8, null));
        
        AssociativeArray xData9 = new AssociativeArray();
        xData9.put(0, 3);
        xData9.put(1, 5);
        xData9.put(2, 6);
        xData9.put(3, 7);
        dataset.add(new Record(xData9, null));
        
        AssociativeArray xData10 = new AssociativeArray();
        xData10.put(0, 1);
        xData10.put(1, 3);
        xData10.put(2, 7);
        xData10.put(3, 5);
        dataset.add(new Record(xData10, null));
        
        AssociativeArray xData11 = new AssociativeArray();
        xData11.put(0, 2);
        xData11.put(1, 6);
        xData11.put(2, 6);
        xData11.put(3, 7);
        dataset.add(new Record(xData11, null));
        
        AssociativeArray xData12 = new AssociativeArray();
        xData12.put(0, 5);
        xData12.put(1, 7);
        xData12.put(2, 7);
        xData12.put(3, 6);
        dataset.add(new Record(xData12, null));
        
        AssociativeArray xData13 = new AssociativeArray();
        xData13.put(0, 2);
        xData13.put(1, 4);
        xData13.put(2, 5);
        xData13.put(3, 6);
        dataset.add(new Record(xData13, null));
        
        AssociativeArray xData14 = new AssociativeArray();
        xData14.put(0, 3);
        xData14.put(1, 5);
        xData14.put(2, 6);
        xData14.put(3, 5);
        dataset.add(new Record(xData14, null));
        
        AssociativeArray xData15 = new AssociativeArray();
        xData15.put(0, 1);
        xData15.put(1, 6);
        xData15.put(2, 5);
        xData15.put(3, 5);
        dataset.add(new Record(xData15, null));
        
        AssociativeArray xData16 = new AssociativeArray();
        xData16.put(0, 2);
        xData16.put(1, 3);
        xData16.put(2, 7);
        xData16.put(3, 7);
        dataset.add(new Record(xData16, null));
        
        return dataset;
    }
    
    /**
     * Test of covarianceMatrix method, of class Bivariate.
     */
    @Test
    public void testCovarianceMatrix() {
        TestUtils.log(this.getClass(), "covarianceMatrix");
        Dataset dataSet = generateDataset();
        DataTable2D expResult = new DataTable2D();
        expResult.put2d(0, 0, 4.5625);
        expResult.put2d(0, 1, 0.5875);
        expResult.put2d(0, 2, -2.7);
        expResult.put2d(0, 3, -2.2041666666667);
        expResult.put2d(1, 0, 0.5875);
        expResult.put2d(1, 1, 2.1958333333333);
        expResult.put2d(1, 2, -0.43333333333333);
        expResult.put2d(1, 3, -0.3125);
        expResult.put2d(2, 0, -2.7);
        expResult.put2d(2, 1, -0.43333333333333);
        expResult.put2d(2, 2, 4.0);
        expResult.put2d(2, 3, 3.0333333333333);
        expResult.put2d(3, 0, -2.2041666666667);
        expResult.put2d(3, 1, -0.3125);
        expResult.put2d(3, 2, 3.0333333333333);
        expResult.put2d(3, 3, 3.1625);
        
        DataTable2D result = Bivariate.covarianceMatrix(dataSet);
        TestUtils.assertDoubleDataTable2D(expResult, result);
    }

    /**
     * Test of pearsonMatrix method, of class Bivariate.
     */
    @Test
    public void testPearsonMatrix() {
        TestUtils.log(this.getClass(), "pearsonMatrix");
        Dataset dataSet = generateDataset();
        DataTable2D expResult = new DataTable2D();
        expResult.put2d(0, 0, 1.0);
        expResult.put2d(0, 1, 0.18561229707779);
        expResult.put2d(0, 2, -0.63202219485911);
        expResult.put2d(0, 3, -0.58026680188263);
        expResult.put2d(1, 0, 0.18561229707779);
        expResult.put2d(1, 1, 1.0);
        expResult.put2d(1, 2, -0.14621516381791);
        expResult.put2d(1, 3, -0.11858644989229);
        expResult.put2d(2, 0, -0.63202219485911);
        expResult.put2d(2, 1, -0.14621516381791);
        expResult.put2d(2, 2, 1.0);
        expResult.put2d(2, 3, 0.85285436162523);
        expResult.put2d(3, 0, -0.58026680188263);
        expResult.put2d(3, 1, -0.11858644989229);
        expResult.put2d(3, 2, 0.85285436162523);
        expResult.put2d(3, 3, 1.0);
        
        DataTable2D result = Bivariate.pearsonMatrix(dataSet);
        TestUtils.assertDoubleDataTable2D(expResult, result);
    }

    /**
     * Test of spearmanMatrix method, of class Bivariate.
     */
    @Test
    public void testSpearmanMatrix() {
        TestUtils.log(this.getClass(), "spearmanMatrix");
        Dataset dataSet = generateDataset();
        DataTable2D expResult = new DataTable2D();
        expResult.put(0, new AssociativeArray());
        expResult.put2d(0, 0, 1.0);
        expResult.put2d(0, 1, 0.10229198378533);
        expResult.put2d(0, 2, -0.60665935791938);
        expResult.put2d(0, 3, -0.56631689758552);
        expResult.put2d(1, 0, 0.10229198378533);
        expResult.put2d(1, 1, 1.0);
        expResult.put2d(1, 2, -0.14688588181833);
        expResult.put2d(1, 3, -0.087423415709411);
        expResult.put2d(2, 0, -0.60665935791938);
        expResult.put2d(2, 1, -0.14688588181833);
        expResult.put2d(2, 2, 1.0);
        expResult.put2d(2, 3, 0.8472888999181);
        expResult.put2d(3, 0, -0.56631689758552);
        expResult.put2d(3, 1, -0.087423415709411);
        expResult.put2d(3, 2, 0.8472888999181);
        expResult.put2d(3, 3, 1.0);
        
        DataTable2D result = Bivariate.spearmanMatrix(dataSet);
        TestUtils.assertDoubleDataTable2D(expResult, result);
    }

    /**
     * Test of kendalltauMatrix method, of class Bivariate.
     */
    @Test
    public void testKendalltauMatrix() {
        TestUtils.log(this.getClass(), "kendalltauMatrix");
        Dataset dataSet = generateDataset();
        DataTable2D expResult = new DataTable2D();
        expResult.put2d(0, 0, 1.0);
        expResult.put2d(0, 1, 0.066666666666667);
        expResult.put2d(0, 2, -0.36666666666667);
        expResult.put2d(0, 3, -0.35);
        expResult.put2d(1, 0, 0.066666666666667);
        expResult.put2d(1, 1, 1.0);
        expResult.put2d(1, 2, -0.083333333333333);
        expResult.put2d(1, 3, -0.05);
        expResult.put2d(2, 0, -0.36666666666667);
        expResult.put2d(2, 1, -0.083333333333333);
        expResult.put2d(2, 2, 1.0);
        expResult.put2d(2, 3, 0.64166666666667);
        expResult.put2d(3, 0, -0.35);
        expResult.put2d(3, 1, -0.05);
        expResult.put2d(3, 2, 0.64166666666667);
        expResult.put2d(3, 3, 1.0);
        
        DataTable2D result = Bivariate.kendalltauMatrix(dataSet);
        TestUtils.assertDoubleDataTable2D(expResult, result);
    }
    
}

/*******************************************************************************
 * Copyright 2009 OpenSHA.org in partnership with
 * the Southern California Earthquake Center (SCEC, http://www.scec.org)
 * at the University of Southern California and the UnitedStates Geological
 * Survey (USGS; http://www.usgs.gov)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package scratch.UCERF3.erf.ETAS.ETAS_Params;

import org.opensha.commons.param.impl.DoubleParameter;

/**
 * 
 */
public class U3ETAS_TotalRateScaleFactorParam extends DoubleParameter {
	
	private static final long serialVersionUID = 1L;
	
	public final static String NAME = "TotalRateScaleFactor";
	public final static String INFO = "The amount by which the total region MFD is multiplied by";
	private static final String UNITS = null;
	protected final static Double MIN = new Double(0.5);
	protected final static Double MAX = new Double(2.0);
	public final static Double DEFAULT_VALUE = new Double(1.14);


	/**
	 * This sets the default value as given.
	 */
	public U3ETAS_TotalRateScaleFactorParam(double defaultValue) {
		super(NAME, MIN, MAX, UNITS);
		getConstraint().setNonEditable();
	    setInfo(INFO);
	    setDefaultValue(defaultValue);
	    setValueAsDefault();
	}

	/**
	 * This sets the default value as 10.
	 */
	public U3ETAS_TotalRateScaleFactorParam() { this(DEFAULT_VALUE);}
	
	
}

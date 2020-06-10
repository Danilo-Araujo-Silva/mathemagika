package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StateSpaceModel
 * 
 * Full name:        System`StateSpaceModel
 * 
 *                   StateSpaceModel[{a, b, c, d}] represents the standard state-space model with state matrix a, input matrix b, output matrix c, and transmission matrix d.
 *                   StateSpaceModel[{a, b, c, d, e}] represents a descriptor state-space model with descriptor matrix e.
 *                   StateSpaceModel[sys] gives a state-space model corresponding to the systems model sys.
 *                   StateSpaceModel[eqns, {{x , x  }, …}, {{u , u  }, …}, {g , …}, τ] gives the state-space model obtained by Taylor linearization about the point (x  , u  ) of the differential or difference equations eqns with outputs g  and independent variable τ.
 * Usage:                                     1   10          1   10         1                                                                                        i0   i0                                                                 i
 * 
 *                   Appearance -> Automatic
 *                   DescriptorStateSpace -> Automatic
 *                   ExternalTypeSignature -> Automatic
 *                   SamplingPeriod -> Automatic
 *                   StateSpaceRealization -> Automatic
 * Options:          SystemsModelLabels -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StateSpaceModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/StateSpaceModel.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun stateSpaceModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StateSpaceModel", arguments.toMutableList(), options)
}

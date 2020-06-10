package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Fit
 * 
 * Full name:        System`Fit
 * 
 *                   Fit[data, {f , …, f }, {x, y, …}] finds a fit a  ⁢ f  + … + a  ⁢ f  to a list of data for functions f , …, f  of variables {x, y, …}. 
 *                               1      n                           1    1        n    n                                  1      n
 *                   Fit[{m, v}] finds a fit vector a that minimizes || m . a - v || for a design matrix m.
 * Usage:            Fit[…, "prop"] specifies what fit property prop should be returned.
 * 
 *                   FitRegularization -> None
 *                   NormFunction -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Fit
 * Documentation:    web: http://reference.wolfram.com/language/ref/Fit.html
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
fun fit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Fit", arguments.toMutableList(), options)
}

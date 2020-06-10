package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DesignMatrix
 * 
 * Full name:        System`DesignMatrix
 * 
 *                   DesignMatrix[{{x  , x  , …, y }, {x  , x  , …, y }, …}, {f , f , …}, {x , x , …}] constructs the design matrix for the linear model β  + β  f  + β  f  + ….
 * Usage:                            11   12      1     21   22      2         1   2        1   2                                                         0    1  1    2  2
 * 
 *                   IncludeConstantBasis -> True
 *                   NominalVariables -> None
 * Options:          WorkingPrecision -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DesignMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/DesignMatrix.html
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
fun designMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DesignMatrix", arguments.toMutableList(), options)
}

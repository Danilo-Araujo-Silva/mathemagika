package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeometricScene
 *
 * Full name:        System`GeometricScene
 *
 *                   GeometricScene[{p , p , …}, {hyp , hyp , …}] represents an abstract 2D geometric scene defined by the hypotheses hyp  in terms of the symbolic points p .
 *                                    1   2          1     2                                                                             i                                  i
 *                   GeometricScene[{{p , p , …}, {k , k , …}}, hyps] represents a scene whose hypotheses depend on the symbolic scalar quantities k .
 *                                     1   2        1   2                                                                                           i
 *                   GeometricScene[{{p   {x , y }, …}, {k   v , …}}, hyps] represents a specific instance with explicit values for all points and scalar quantities.
 *                                     1     1   1         1    1
 *                   GeometricScene[{{{p   {x , y }, …}, {k   v , …}}, …}, hyps] represents a collection of specific instances of the same scene.
 *                                      1     1   1         1    1
 *                   GeometricScene[…, …, {con , con , …}] represents a scene together with some conclusions con  about it.
 *                                            1     2                                                           i
 *                   GeometricScene[{scene , scene , …}] combines several scene instances into one scene object.
 * Usage:                                 1       2
 *
 * Options:          UnconstrainedParameters -> None
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeometricScene
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeometricScene.html
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
fun geometricScene(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeometricScene", arguments.toMutableList(), options)
}

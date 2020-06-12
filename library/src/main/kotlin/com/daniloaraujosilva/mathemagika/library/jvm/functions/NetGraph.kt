package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetGraph
 *
 * Full name:        System`NetGraph
 *
 *                   NetGraph[{layer , layer , …}, {m   n , m   n , …}] specifies a neural net defined by a graph in which the output of layer m  is given as input to layer n .
 *                                  1       2        1    1   2    2                                                                              i                             i
 *                   NetGraph[ name   layer , name   layer , … , {name    name  , …}] specifies a net with explicitly named layers.
 * Usage:                           1        1      2        2            m1       n1
 *
 * Options:          LearningRateMultipliers -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetGraph
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetGraph.html
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
fun netGraph(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetGraph", arguments.toMutableList(), options)
}

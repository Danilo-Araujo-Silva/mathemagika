package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FoldList
 *
 * Full name:        System`FoldList
 *
 *                   FoldList[f, x, {a, b, …}] gives {x, f[x, a], f[f[x, a], b], …}.
 *                   FoldList[f, {a, b, c, …}] gives {a, f[a, b], f[f[a, b], c], …}.
 * Usage:            FoldList[f] represents an operator form of FoldList that can be applied to expressions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FoldList
 * Documentation:    web: http://reference.wolfram.com/language/ref/FoldList.html
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
fun foldList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FoldList", arguments.toMutableList(), options)
}

package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ConicHullRegion
 *
 * Full name:        System`ConicHullRegion
 *
 *                   ConicHullRegion[{p , …, p     }] represents the m-dimensional affine hull region passing through points p .
 *                                     1      m + 1                                                                           i
 *                   ConicHullRegion[p, {v , …, v }] represents the m-dimensional affine hull region passing through the point p and parallel to v .
 *                                        1      m                                                                                                i
 *                   ConicHullRegion[{p , …, p     }, {w , …, w }] represents the m-dimensional affine hull plus the conic hull generated by the vectors w .
 *                                     1      m + 1     1      n                                                                                          j
 *                   ConicHullRegion[p, {v , …, v }, {w , …, w }] represents the m-dimensional affine hull plus the conic hull generated by the vectors w .
 * Usage:                                 1      m     1      n                                                                                          j
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConicHullRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConicHullRegion.html
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
fun conicHullRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConicHullRegion", arguments.toMutableList(), options)
}
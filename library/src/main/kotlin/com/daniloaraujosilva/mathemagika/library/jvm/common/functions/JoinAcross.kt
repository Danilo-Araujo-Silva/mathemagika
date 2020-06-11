package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JoinAcross
 *
 * Full name:        System`JoinAcross
 *
 *                   JoinAcross[{a , a , …}, {b , b , …}, key] gives a list of associations obtained by joining those pairs of associations a  and b  in which the values associated with key are the same.
 *                                1   2        1   2                                                                                         i      j
 *                   JoinAcross[{a , a , …}, {b , b , …}, {key , key , …}] joins pairs of associations only when the values associated with all keys key  are the same.
 *                                1   2        1   2          1     2                                                                                   i
 *                   JoinAcross[{a , a , …}, {b , b , …}, key   key ] joins pairs of associations a , b  in which the values associated with key  in the a  are the same as those associated with key  in the b .
 *                                1   2        1   2         a      b                               i   j                                        a         i                                          b         j
 *                   JoinAcross[{a , a , …}, {b , b , …}, {key    key  , …}] joins pairs of associations in which pairs of corresponding values agree.
 *                                1   2        1   2          a       b
 *                                                             1       1
 * Usage:            JoinAcross[alist, blist, spec, "jspec"] uses jspec to determine when to allow associations that contain missing elements to be generated.
 *
 * Options:          KeyCollisionFunction -> Left
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/JoinAcross
 * Documentation:    web: http://reference.wolfram.com/language/ref/JoinAcross.html
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
fun joinAcross(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JoinAcross", arguments.toMutableList(), options)
}

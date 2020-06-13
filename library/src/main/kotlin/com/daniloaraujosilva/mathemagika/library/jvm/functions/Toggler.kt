package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Toggler
 *
 * Full name:        System`Toggler
 *
 *                   Toggler[x] represents a toggler button with setting x, that toggles between True and False.
 *                   Toggler[Dynamic[x]] takes the setting to be the dynamically updated current value of x, with the value of x being toggled if the button is clicked.
 *                   Toggler[x, {val , val , …}] represents a toggler button that cycles through any sequence of values val .
 *                                  1     2                                                                                i
 *                   Toggler[x, {val   pict , val   pict , …}] cycles through values val  displaying them as pict .
 *                                  1       1     2       2                               i                        i
 *                   Toggler[x, vlist, dpict] displays as dpict if x is none of the val .
 * Usage:                                                                              i
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> False
 *                   DefaultBaseStyle -> Toggler
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 * Options:          ImageSize -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Toggler
 * Documentation:    web: http://reference.wolfram.com/language/ref/Toggler.html
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
fun toggler(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Toggler", arguments.toMutableList(), options)
}

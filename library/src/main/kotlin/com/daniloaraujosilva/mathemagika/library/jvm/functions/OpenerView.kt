package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OpenerView
 *
 * Full name:        System`OpenerView
 *
 *                   OpenerView[{expr , expr }] represents an object which displays as an opener, together with expr  if the opener is closed, and both expr  and expr  if it is open.
 *                                   1      2                                                                       1                                       1         2
 *                   OpenerView[{expr , expr }, state] specifies the state of the opener, with False being closed, and True being open.
 * Usage:                            1      2
 *
 *                   Alignment -> Automatic
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> False
 *                   DefaultBaseStyle -> OpenerView
 *                   Deployed -> False
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   Method -> Automatic
 * Options:          Spacings -> {0.2, 0.5}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OpenerView
 * Documentation:    web: http://reference.wolfram.com/language/ref/OpenerView.html
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
fun openerView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OpenerView", arguments.toMutableList(), options)
}

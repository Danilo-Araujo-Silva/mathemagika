package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Locator
 *
 * Full name:        System`Locator
 *
 *                   Locator[{x, y}] represents a locator object at position {x, y} in a graphic.
 *                   Locator[Dynamic[pos]] takes the position to be the dynamically updated current value of pos, with this value being reset if the locator object is moved.
 *                   Locator[{x, y}, obj] displays obj as the locator object.
 * Usage:            Locator[{x, y}, None] displays nothing visible as the locator object.
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> {Automatic, Automatic}
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> {}
 *                   Enabled -> Automatic
 *                   FrameMargins -> 3.
 *                   ImageMargins -> 0.
 *                   ImageSize -> Automatic
 *                   LocatorCentering -> False
 * Options:          LocatorRegion -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Locator
 * Documentation:    web: http://reference.wolfram.com/language/ref/Locator.html
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
fun locator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Locator", arguments.toMutableList(), options)
}

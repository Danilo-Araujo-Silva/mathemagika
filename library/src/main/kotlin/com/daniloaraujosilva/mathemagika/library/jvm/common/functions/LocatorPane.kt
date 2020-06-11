package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocatorPane
 *
 * Full name:        System`LocatorPane
 *
 *                   LocatorPane[{x, y}, back] represents a pane with a locator at position {x, y} and background back.
 *                   LocatorPane[Dynamic[pt], back] takes the locator position to be the dynamically updated current value of pt, with the value of pt being reset if the locator is moved.
 *                   LocatorPane[{pt , pt , …}, back] sets up multiple locators at positions pt , pt , ….
 *                                  1    2                                                     1    2
 *                   LocatorPane[Dynamic[{pt , pt , …}], back] takes the locator positions to be dynamically updated current values of the pt .
 *                                          1    2                                                                                           i
 *                   LocatorPane[pts, back, {{x   , y   }, {x   , y   }}] specifies the range of coordinates for the locator.
 *                                             min   min     max   max
 *                   LocatorPane[pts, back, {{x   , y   }, {x   , y   }, {dx, dy}}] uses jumps dx, dy.
 * Usage:                                      min   min     max   max
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> LocatorPane
 *                   Enabled -> Automatic
 *                   Exclusions -> {}
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   LocatorAutoCreate -> False
 *                   TouchscreenAutoZoom -> False
 * Options:          UseGraphicsRange -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocatorPane
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocatorPane.html
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
fun locatorPane(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocatorPane", arguments.toMutableList(), options)
}

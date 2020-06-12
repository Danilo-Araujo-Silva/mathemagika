package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GalleryView
 *
 * Full name:        System`GalleryView
 *
 *                   GalleryView[{expr , expr , …}] represents an object in which the expr  are displayed in a browsable gallery layout.
 *                                    1      2                                            i
 *                   GalleryView[{assoc , assoc , …}] uses each of the associations assoc  to define the display of an item in the gallery.
 * Usage:                              1       2                                         i
 *
 *                   AppearanceRules -> Automatic
 *                   CachePersistence -> Automatic
 *                   ImageFormattingWidth -> Automatic
 *                   ImageSize -> Automatic
 *                   PageTheme -> Automatic
 * Options:          Pagination -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GalleryView
 * Documentation:    web: http://reference.wolfram.com/language/ref/GalleryView.html
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
fun galleryView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GalleryView", arguments.toMutableList(), options)
}

package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SoundNote
 *
 * Full name:        System`SoundNote
 *
 *                   SoundNote[pitch] represents a music-like sound note with the specified pitch.
 *                   SoundNote[pitch, t] takes the note to have duration t.
 *                   SoundNote[pitch, {t   , t   }] takes the note to occupy the time interval t    to t   .
 *                                      min   max                                               min     max
 *                   SoundNote[pitch, tspec, "style"] takes the note to be in the specified style.
 * Usage:            SoundNote[pitch, tspec, "style", opts] uses the specified rendering options for the note.
 *
 * Options:          SoundVolume -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SoundNote
 * Documentation:    web: http://reference.wolfram.com/language/ref/SoundNote.html
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
fun soundNote(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SoundNote", arguments.toMutableList(), options)
}

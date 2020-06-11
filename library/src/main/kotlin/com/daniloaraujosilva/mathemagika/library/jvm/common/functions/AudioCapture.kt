package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioCapture
 *
 * Full name:        System`AudioCapture
 *
 *                   AudioCapture[] creates a temporary interactive interface for capturing an audio signal.
 * Usage:            AudioCapture[file] captures an audio signal into file.
 *
 *                   AnnotationRules -> None
 *                   Appearance -> Automatic
 *                   AudioChannelAssignment -> Automatic
 *                   AudioInputDevice -> Automatic
 *                   AudioLabel -> Automatic
 *                   AudioOutputDevice -> Automatic
 *                   CaptureRunning -> Automatic
 *                   MaxDuration -> None
 *                   MetaInformation -> <||>
 *                   OverwriteTarget -> False
 *                   SampleRate -> Automatic
 * Options:          SoundVolume -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioCapture
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioCapture.html
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
fun audioCapture(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioCapture", arguments.toMutableList(), options)
}

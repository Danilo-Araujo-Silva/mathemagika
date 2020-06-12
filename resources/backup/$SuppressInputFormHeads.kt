package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 *                   Graphics
 *                   Graphics3D
 *                   ContourGraphics
 *                   DensityGraphics
 *                   SurfaceGraphics
 *                   GraphicsArray
 * Name:             Sound
 *
 *                   System`Graphics
 *                   System`Graphics3D
 *                   System`ContourGraphics
 *                   System`DensityGraphics
 *                   System`SurfaceGraphics
 *                   System`GraphicsArray
 * Full name:        System`Sound
 *
 *                   {Graphics[primitives, options] represents a two-dimensional graphical image. }
 *                   {Graphics3D[primitives, options] represents a three-dimensional graphical image. }
 *                   {ContourGraphics[array] is a representation of a contour plot. }
 *                   {DensityGraphics[array] is a representation of a density plot. }
 *                   {SurfaceGraphics[array] is a representation of a three-dimensional plot of a surface, with heights of each point on a grid specified by values in array. , SurfaceGraphics[array, shades] represents a surface, whose parts are shaded according to the array shades. }
 *                   {GraphicsArray[{g , g , …}] represents a row of graphics objects., GraphicsArray[{{g  , g  , …}, …}] represents a two-dimensional array of graphical objects.}
 *                                    1   2                                                              11   12
 *                   {Sound[primitives] represents a sound. , Sound[primitives, t] specifies that the sound should have duration t., Sound[primitives, {t   , t   }] specifies that the sound should extend from time t    to time t   .}
 * Usage:                                                                                                                                                min   max                                                     min          max
 *
 *                   AlignmentPoint -> Center     AspectRatio -> Automatic Axes -> False               AxesLabel -> None       AxesOrigin -> Automatic AxesStyle -> {}         Background -> None         BaselinePosition -> Automatic BaseStyle -> {}          ColorOutput -> Automatic      ContentSelectable -> Automatic CoordinatesToolOptions -> Automatic DisplayFunction :> $DisplayFunction Epilog -> {}              FormatType :> TraditionalForm Frame -> False               FrameLabel -> None                  FrameStyle -> {}               FrameTicks -> Automatic    FrameTicksStyle -> {}         GridLines -> None           GridLinesStyle -> {}                ImageMargins -> 0.                  ImagePadding -> All                                                                                                       ImageSize -> Automatic  ImageSizeRaw -> Automatic    LabelStyle -> {}              Method -> Automatic     PlotLabel -> None        PlotRange -> All       PlotRangeClipping -> False PlotRangePadding -> Automatic PlotRegion -> Automatic       PreserveImageOptions -> Automatic Prolog -> {}                      RotateLabel -> True     Ticks -> Automatic            TicksStyle -> {}
 *                   AlignmentPoint -> Center     AspectRatio -> Automatic AutomaticImageSize -> False Axes -> False           AxesEdge -> Automatic   AxesLabel -> None       AxesOrigin -> Automatic    AxesStyle -> {}               Background -> None       BaselinePosition -> Automatic BaseStyle -> {}                Boxed -> True                       BoxRatios -> Automatic              BoxStyle -> {}            ClipPlanes -> None            ClipPlanesStyle -> Automatic ColorOutput -> Automatic            ContentSelectable -> Automatic ControllerLinking -> False ControllerMethod -> Automatic ControllerPath -> Automatic CoordinatesToolOptions -> Automatic DisplayFunction :> $DisplayFunction Epilog -> {}                                                                                                              FaceGrids -> None       FaceGridsStyle -> {}         FormatType :> TraditionalForm ImageMargins -> 0.      ImagePadding -> All      ImageSize -> Automatic ImageSizeRaw -> Automatic  LabelStyle -> {}              Lighting -> Automatic         Method -> Automatic               PlotLabel -> None                 PlotRange -> All        PlotRangePadding -> Automatic PlotRegion -> Automatic PreserveImageOptions -> Automatic Prolog -> {}                 RotationAction -> Fit SphericalRegion -> Automatic Ticks -> Automatic TicksStyle -> {} TouchscreenAutoZoom -> False ViewAngle -> Automatic ViewCenter -> Automatic ViewMatrix -> Automatic ViewPoint -> {1.3, -2.4, 2.} ViewProjection -> Automatic ViewRange -> All ViewVector -> Automatic ViewVertical -> {0, 0, 1}
 *                   AspectRatio -> 1             Axes -> False            AxesLabel -> None           AxesOrigin -> Automatic AxesStyle -> Automatic  Background -> Automatic ColorFunction -> Automatic ColorFunctionScaling -> True  ColorOutput -> Automatic ContourLines -> True          Contours -> 10                 ContourShading -> True              ContourSmoothing -> True            ContourStyle -> Automatic DefaultColor -> Automatic     DefaultFont :> $DefaultFont  DisplayFunction :> $DisplayFunction Epilog -> {}                   FormatType :> $FormatType  Frame -> True                 FrameLabel -> None          FrameStyle -> Automatic             FrameTicks -> Automatic             ImageSize -> Automatic                                                                                                    MeshRange -> Automatic  PlotLabel -> None            PlotRange -> Automatic        PlotRegion -> Automatic Prolog -> {}             RotateLabel -> True    TextStyle :> $TextStyle    Ticks -> Automatic
 *                   AspectRatio -> 1             Axes -> False            AxesLabel -> None           AxesOrigin -> Automatic AxesStyle -> Automatic  Background -> Automatic ColorFunction -> Automatic ColorFunctionScaling -> True  ColorOutput -> Automatic DefaultColor -> Automatic     DefaultFont :> $DefaultFont    DisplayFunction :> $DisplayFunction Epilog -> {}                        FormatType :> $FormatType Frame -> True                 FrameLabel -> None           FrameStyle -> Automatic             FrameTicks -> Automatic        ImageSize -> Automatic     Mesh -> True                  MeshRange -> Automatic      MeshStyle -> Automatic              PlotLabel -> None                   PlotRange -> Automatic                                                                                                    PlotRegion -> Automatic Prolog -> {}                 RotateLabel -> True           TextStyle :> $TextStyle Ticks -> Automatic
 *                   AmbientLight -> GrayLevel[0] AspectRatio -> Automatic Axes -> False               AxesEdge -> Automatic   AxesLabel -> None       AxesStyle -> Automatic  Background -> Automatic    Boxed -> True                 BoxRatios -> {1, 1, 0.4} BoxStyle -> Automatic         ClipFill -> Automatic          ColorFunction -> Automatic          ColorFunctionScaling -> True        ColorOutput -> Automatic  DefaultColor -> Automatic     DefaultFont :> $DefaultFont  DisplayFunction :> $DisplayFunction Epilog -> {}                   FaceGrids -> None          FormatType :> $FormatType     HiddenSurface -> True       ImageSize -> Automatic              Lighting -> True                    LightSources -> {{{1., 0., 1.}, RGBColor[1, 0, 0]}, {{1., 1., 1.}, RGBColor[0, 1, 0]}, {{0., 1., 1.}, RGBColor[0, 0, 1]}} Mesh -> True            Charting`MeshMarkers -> None MeshRange -> Automatic        MeshStyle -> Automatic  Plot3Matrix -> Automatic PlotLabel -> None      PlotRange -> Automatic     PlotRegion -> Automatic       Prolog -> {}                  Shading -> True                   SphericalRegion -> False          TextStyle :> $TextStyle Ticks -> Automatic            ViewCenter -> Automatic ViewPoint -> {1.3, -2.4, 2.}      ViewVertical -> {0., 0., 1.}
 *                   AlignmentPoint -> Center     AspectRatio -> Automatic Axes -> False               AxesLabel -> None       AxesOrigin -> Automatic AxesStyle -> {}         Background -> None         BaselinePosition -> Automatic BaseStyle -> {}          ColorOutput -> Automatic      ContentSelectable -> Automatic CoordinatesToolOptions -> Automatic DisplayFunction :> $DisplayFunction Epilog -> {}              FormatType :> TraditionalForm Frame -> False               FrameLabel -> None                  FrameStyle -> {}               FrameTicks -> None         FrameTicksStyle -> {}         GraphicsSpacing -> 0.1      GridLines -> None                   GridLinesStyle -> {}                ImageMargins -> 0.                                                                                                        ImagePadding -> All     ImageSize -> Automatic       ImageSizeRaw -> Automatic     LabelStyle -> {}        Method -> Automatic      PlotLabel -> None      PlotRange -> Automatic     PlotRangeClipping -> False    PlotRangePadding -> Automatic PlotRegion -> Automatic           PreserveImageOptions -> Automatic Prolog -> {}            RotateLabel -> True           Ticks -> None           TicksStyle -> {}
 * Options:          SoundVolume -> 1
 *
 *                   Protected                    ReadProtected
 *                   Protected                    ReadProtected
 *                   Protected                    ReadProtected
 *                   Protected                    ReadProtected
 *                   Protected                    ReadProtected
 *                   Protected                    ReadProtected
 * Attributes:       Protected                    ReadProtected
 *
 *                   local: <>{<|Local -> paclet:ref/Graphics, Web -> http://reference.wolfram.com/language/ref/Graphics.html|>, <|Local -> paclet:ref/Graphics3D, Web -> http://reference.wolfram.com/language/ref/Graphics3D.html|>, <|Local -> paclet:ref/ContourGraphics, Web -> http://reference.wolfram.com/language/ref/ContourGraphics.html|>, <|Local -> paclet:ref/DensityGraphics, Web -> http://reference.wolfram.com/language/ref/DensityGraphics.html|>, <|Local -> paclet:ref/SurfaceGraphics, Web -> http://reference.wolfram.com/language/ref/SurfaceGraphics.html|>, <|Local -> paclet:ref/GraphicsArray, Web -> http://reference.wolfram.com/language/ref/GraphicsArray.html|>, <|Local -> paclet:ref/Sound, Web -> http://reference.wolfram.com/language/ref/Sound.html|>}[Local]
 * Documentation:    web: <>{<|Local -> paclet:ref/Graphics, Web -> http://reference.wolfram.com/language/ref/Graphics.html|>, <|Local -> paclet:ref/Graphics3D, Web -> http://reference.wolfram.com/language/ref/Graphics3D.html|>, <|Local -> paclet:ref/ContourGraphics, Web -> http://reference.wolfram.com/language/ref/ContourGraphics.html|>, <|Local -> paclet:ref/DensityGraphics, Web -> http://reference.wolfram.com/language/ref/DensityGraphics.html|>, <|Local -> paclet:ref/SurfaceGraphics, Web -> http://reference.wolfram.com/language/ref/SurfaceGraphics.html|>, <|Local -> paclet:ref/GraphicsArray, Web -> http://reference.wolfram.com/language/ref/GraphicsArray.html|>, <|Local -> paclet:ref/Sound, Web -> http://reference.wolfram.com/language/ref/Sound.html|>}[Web]
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Definitions:      None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Own values:       None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Down values:      None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Up values:        None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Sub values:       None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Default value:    None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Numeric values:   None
 */
fun `$SuppressInputFormHeads`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$SuppressInputFormHeads", arguments.toMutableList(), options)
}

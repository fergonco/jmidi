package org.fergonco.music.midi;

import java.util.HashMap;

public class InstrumentNames {

	private static final HashMap<String, Integer> nameCode = new HashMap<>();

	public static int getInstrument(String instrumentName) {
		Integer instrumentCode = nameCode.get(instrumentName.toUpperCase());
		if (instrumentCode == null) {
			throw new IllegalArgumentException("Instrument not found: " + instrumentName);
		}
		return instrumentCode;
	}

	static {
		// Any should do for writing midi
		nameCode.put("DRUMS", Instrument.PIANO);

		nameCode.put("PIANO", Instrument.PIANO);
		nameCode.put("HONKYTONK", Instrument.HONKYTONK);
		nameCode.put("ELECTRIC_PIANO", Instrument.ELECTRIC_PIANO);
		nameCode.put("EPIANO", Instrument.EPIANO2);
		nameCode.put("HARPSICHORD", Instrument.HARPSICHORD);
		nameCode.put("CLAVINET", Instrument.CLAVINET);
		nameCode.put("CELESTA", Instrument.CELESTA);
		nameCode.put("GLOCKENSPIEL", Instrument.GLOCKENSPIEL);
		nameCode.put("MUSIC_BOX", Instrument.MUSIC_BOX);
		nameCode.put("VIBRAPHONE", Instrument.VIBRAPHONE);
		nameCode.put("MARIMBA", Instrument.MARIMBA);
		nameCode.put("XYLOPHONE", Instrument.XYLOPHONE);
		nameCode.put("TUBULAR_BELLS", Instrument.TUBULAR_BELLS);
		nameCode.put("ELECTRIC_ORGAN", Instrument.ELECTRIC_ORGAN);
		nameCode.put("JAZZ_ORGAN", Instrument.JAZZ_ORGAN);
		nameCode.put("ORGAN", Instrument.ORGAN3);
		nameCode.put("PIPE_ORGAN", Instrument.PIPE_ORGAN);
		nameCode.put("REED_ORGAN", Instrument.REED_ORGAN);
		nameCode.put("ACCORDION", Instrument.ACCORDION);
		nameCode.put("HARMONICA", Instrument.HARMONICA);
		nameCode.put("BANDNEON", Instrument.BANDNEON);
		nameCode.put("ACOUSTIC_GUITAR", Instrument.ACOUSTIC_GUITAR);
		nameCode.put("STEEL_GUITAR", Instrument.STEEL_GUITAR);
		nameCode.put("JAZZ_GUITAR", Instrument.JAZZ_GUITAR);
		nameCode.put("ELECTRIC_GUITAR", Instrument.ELECTRIC_GUITAR);
		nameCode.put("MUTED_GUITAR", Instrument.MUTED_GUITAR);
		nameCode.put("OVERDRIVE_GUITAR", Instrument.OVERDRIVE_GUITAR);
		nameCode.put("DISTORTED_GUITAR", Instrument.DISTORTED_GUITAR);
		nameCode.put("GUITAR_HARMONICS", Instrument.GUITAR_HARMONICS);
		nameCode.put("ACOUSTIC_BASS", Instrument.ACOUSTIC_BASS);
		nameCode.put("FINGERED_BASS", Instrument.FINGERED_BASS);
		nameCode.put("PICKED_BASS", Instrument.PICKED_BASS);
		nameCode.put("FRETLESS_BASS", Instrument.FRETLESS_BASS);
		nameCode.put("SLAP_BASS", Instrument.SLAP_BASS);
		nameCode.put("SYNTH_BASS", Instrument.SYNTH_BASS);
		nameCode.put("VIOLIN", Instrument.VIOLIN);
		nameCode.put("VIOLA", Instrument.VIOLA);
		nameCode.put("CELLO", Instrument.CELLO);
		nameCode.put("CONTRABASS", Instrument.CONTRABASS);
		nameCode.put("TREMOLO_STRINGS", Instrument.TREMOLO_STRINGS);
		nameCode.put("PIZZICATO_STRINGS", Instrument.PIZZICATO_STRINGS);
		nameCode.put("HARP", Instrument.HARP);
		nameCode.put("TIMPANI", Instrument.TIMPANI);
		nameCode.put("STRINGS", Instrument.STRINGS);
		nameCode.put("SLOW_STRINGS", Instrument.SLOW_STRINGS);
		nameCode.put("SYNTH_STRINGS", Instrument.SYNTH_STRINGS);
		nameCode.put("AHHS", Instrument.AHHS);
		nameCode.put("OOHS", Instrument.OOHS);
		nameCode.put("SYNVOX", Instrument.SYNVOX);
		nameCode.put("ORCHESTRA_HIT", Instrument.ORCHESTRA_HIT);
		nameCode.put("TRUMPET", Instrument.TRUMPET);
		nameCode.put("TROMBONE", Instrument.TROMBONE);
		nameCode.put("TUBA", Instrument.TUBA);
		nameCode.put("MUTED_TRUMPET", Instrument.MUTED_TRUMPET);
		nameCode.put("FRENCH_HORN", Instrument.FRENCH_HORN);
		nameCode.put("BRASS", Instrument.BRASS);
		nameCode.put("SYNTH_BRASS", Instrument.SYNTH_BRASS);
		nameCode.put("SOPRANO_SAXOPHONE", Instrument.SOPRANO_SAXOPHONE);
		nameCode.put("ALTO_SAXOPHONE", Instrument.ALTO_SAXOPHONE);
		nameCode.put("TENOR_SAXOPHONE", Instrument.TENOR_SAXOPHONE);
		nameCode.put("BARITONE_SAXOPHONE", Instrument.BARITONE_SAXOPHONE);
		nameCode.put("OBOE", Instrument.OBOE);
		nameCode.put("ENGLISH_HORN", Instrument.ENGLISH_HORN);
		nameCode.put("BASSOON", Instrument.BASSOON);
		nameCode.put("CLARINET", Instrument.CLARINET);
		nameCode.put("PICCOLO", Instrument.PICCOLO);
		nameCode.put("FLUTE", Instrument.FLUTE);
		nameCode.put("RECORDER", Instrument.RECORDER);
		nameCode.put("PAN_FLUTE", Instrument.PAN_FLUTE);
		nameCode.put("BOTTLE_BLOW", Instrument.BOTTLE_BLOW);
		nameCode.put("SHAKUHACHI", Instrument.SHAKUHACHI);
		nameCode.put("WHISTLE", Instrument.WHISTLE);
		nameCode.put("OCARINA", Instrument.OCARINA);
		nameCode.put("SQUARE_WAVE", Instrument.SQUARE_WAVE);
		nameCode.put("SAW_WAVE", Instrument.SAW_WAVE);
		nameCode.put("SYNTH_CALLIOPE", Instrument.SYNTH_CALLIOPE);
		nameCode.put("CHIFFER_LEAD", Instrument.CHIFFER_LEAD);
		nameCode.put("CHARANG", Instrument.CHARANG);
		nameCode.put("SOLO_VOX", Instrument.SOLO_VOX);
		nameCode.put("FANTASIA", Instrument.FANTASIA);
		nameCode.put("WARM_PAD", Instrument.WARM_PAD);
		nameCode.put("POLYSYNTH", Instrument.POLYSYNTH);
		nameCode.put("SPACE_VOICE", Instrument.SPACE_VOICE);
		nameCode.put("BOWED_GLASS", Instrument.BOWED_GLASS);
		nameCode.put("METAL_PAD", Instrument.METAL_PAD);
		nameCode.put("HALO_PAD", Instrument.HALO_PAD);
		nameCode.put("SWEEP_PAD", Instrument.SWEEP_PAD);
		nameCode.put("ICE_RAIN", Instrument.ICE_RAIN);
		nameCode.put("SOUNDTRACK", Instrument.SOUNDTRACK);
		nameCode.put("CRYSTAL", Instrument.CRYSTAL);
		nameCode.put("ATMOSPHERE", Instrument.ATMOSPHERE);
		nameCode.put("BRIGHTNESS", Instrument.BRIGHTNESS);
		nameCode.put("GOBLIN", Instrument.GOBLIN);
		nameCode.put("ECHO_DROPS", Instrument.ECHO_DROPS);
		nameCode.put("STAR_THEME", Instrument.STAR_THEME);
		nameCode.put("SITAR", Instrument.SITAR);
		nameCode.put("BANJO", Instrument.BANJO);
		nameCode.put("SHAMISEN", Instrument.SHAMISEN);
		nameCode.put("KOTO", Instrument.KOTO);
		nameCode.put("KALIMBA", Instrument.KALIMBA);
		nameCode.put("BAGPIPES", Instrument.BAGPIPES);
		nameCode.put("FIDDLE", Instrument.FIDDLE);
		nameCode.put("SHANNAI", Instrument.SHANNAI);
		nameCode.put("TINKLE_BELL", Instrument.TINKLE_BELL);
		nameCode.put("AGOGO", Instrument.AGOGO);
		nameCode.put("STEEL_DRUMS", Instrument.STEEL_DRUMS);
		nameCode.put("WOODBLOCKS", Instrument.WOODBLOCKS);
		nameCode.put("TAIKO", Instrument.TAIKO);
		nameCode.put("SYNTH_DRUM", Instrument.SYNTH_DRUM);
		nameCode.put("TOM_TOMS", Instrument.TOM_TOMS);
		nameCode.put("FRETNOISE", Instrument.FRETNOISE);
		nameCode.put("BREATHNOISE", Instrument.BREATHNOISE);
		nameCode.put("SEASHORE", Instrument.SEASHORE);
		nameCode.put("BIRD", Instrument.BIRD);
		nameCode.put("TELEPHONE", Instrument.TELEPHONE);
		nameCode.put("HELICOPTER", Instrument.HELICOPTER);
		nameCode.put("APPLAUSE", Instrument.APPLAUSE);
	}
}
